package cs520.view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import cs520.model.FileModel;


/* package */ class FileModelListCellRenderer implements ListCellRenderer<FileModel> {	
	@Override
    public Component getListCellRendererComponent(JList<? extends FileModel> list, FileModel value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel(value.toString());
        ImageIcon icon;
        if (value.isFile()) {
        	icon = FileExplorerIcons.FILE_ICON;
        }
        else {
        	icon = FileExplorerIcons.FOLDER_ICON;
        }
        label.setIcon(icon);
        label.setOpaque(true);
        if (isSelected) {
            label.setBackground(Color.BLUE);
            label.setForeground(Color.WHITE);
        } else {
            label.setBackground(Color.WHITE);
            label.setForeground(Color.BLACK);
        }
        return label;
    }
}