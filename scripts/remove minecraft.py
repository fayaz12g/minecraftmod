import os
import json
import tkinter as tk
from tkinter import filedialog

def modify_json_files(folder_path):
    # Get a list of all JSON files in the specified folder
    json_files = [f for f in os.listdir(folder_path) if f.endswith(".json")]

    # Iterate over each JSON file
    for json_file in json_files:
        file_path = os.path.join(folder_path, json_file)
        with open(file_path, "r") as f:
            data = json.load(f)

        # Recursively search for and replace "minecraft" with "potatomod"
        def replace_minecraft(obj):
            if isinstance(obj, dict):
                for key, value in obj.items():
                    if key != "random_sequence" and isinstance(value, str) and "minecraft" in value:
                        continue  # Skip replacement if "minecraft" is in the "type" value
                    obj[key] = replace_minecraft(value)
            elif isinstance(obj, list):
                for i in range(len(obj)):
                    obj[i] = replace_minecraft(obj[i])
            elif isinstance(obj, str):
                obj = obj.replace("minecraft", "potatomod")
            return obj

        modified_data = replace_minecraft(data)

        # Write the modified data back to the file
        with open(file_path, "w") as f:
            json.dump(modified_data, f, indent=4)

        print(f"Modified {json_file} successfully.")

# Create a Tkinter dialog to select the folder
root = tk.Tk()
root.withdraw()  # Hide the main window

folder_path = filedialog.askdirectory(title="Select the folder containing JSON files")

if folder_path:
    # Call the function to modify the JSON files
    modify_json_files(folder_path)
else:
    print("No folder selected. Exiting.")

# Close the Tkinter window
root.destroy()
