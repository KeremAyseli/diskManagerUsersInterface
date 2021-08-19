import javafx.scene.image.ImageView;

public class ListItem {
    
    private ImageView image;
    private String FolderName;
    private long FileSize;

    public ListItem(String FolderName, long FileSize, ImageView image) {
        this.image = image;
        this.FolderName = FolderName;
        this.FileSize = FileSize;
        image.setFitHeight(50);
        image.setFitWidth(80);
    }

    public ListItem() {
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getFolderName() {
        return FolderName;
    }

    public void setFolderName(String folderName) {
        FolderName = folderName;
    }

    public long getFileSize() {
        return FileSize;
    }

    public void setFileSize(long fileSize) {
        FileSize = fileSize;
    }
    
}
