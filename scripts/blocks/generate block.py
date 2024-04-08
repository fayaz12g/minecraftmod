import os
import glob
from tkinter import filedialog
from tkinter import Tk

# Create a UI for folder selection
root = Tk()
root.withdraw()  # Hide the main window
folder_selected = filedialog.askdirectory()  # Open the file dialog

# Find all PNG files in the selected folder
png_files = glob.glob(os.path.join(folder_selected, '*.png'))

# Strip the .png ending and store each name in an array
names = [os.path.splitext(os.path.basename(png_file))[0] for png_file in png_files]

# Format the names and write them to a text file
with open(os.path.join(folder_selected, 'output.txt'), 'w') as f:
    for name in names:
        upper_name = name.upper()
        lower_name = name.lower()
        f.write(f'public static final RegistryObject<Block> {upper_name} = registerBlock("{lower_name}",\n'
                 '            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));\n')
