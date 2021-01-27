package by.epam.jo_05_01_01.bean;

public class Directory {
	
	private String Disk;
	private String Folders;
	
	public Directory() {
		this("C", "Users\\SamIg\\Desktop");
	}
	
	public Directory(String disk, String folders) {
		this.setDisk(disk);
		this.setFolders(folders);
	}

	public String getDisk() {
		return Disk;
	}

	private void setDisk(String disk) {
		Disk = disk;
	}

	public String getFolders() {
		return Folders;
	}

	private void setFolders(String folders) {
		Folders = folders;
	}
	
	public void create() {
		java.io.File f = new java.io.File(getPath());
		f.mkdirs();
	}
	
	public String getPath() {
		return String.format("%s:\\%s", getDisk(), getFolders());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Disk == null) ? 0 : Disk.hashCode());
		result = prime * result + ((Folders == null) ? 0 : Folders.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (Disk == null) {
			if (other.Disk != null)
				return false;
		} else if (!Disk.equals(other.Disk))
			return false;
		if (Folders == null) {
			if (other.Folders != null)
				return false;
		} else if (!Folders.equals(other.Folders))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [Disk=" + Disk + ", Folders=" + Folders + "]";
	}
}
