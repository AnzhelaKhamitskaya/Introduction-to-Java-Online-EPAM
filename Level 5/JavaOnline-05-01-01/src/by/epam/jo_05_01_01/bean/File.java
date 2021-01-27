package by.epam.jo_05_01_01.bean;

import java.io.IOException;

public abstract class File{
	
	private String Name;
	private Extension Extension;
	private Directory Directory;
	
	
	public File() {
		super();
	}
	
	public File(Directory directory, String name, Extension extension) {
		this.setDirectory(directory);
		this.setName(name);
		this.setExtension(extension);
	}


	public String getName() {
		return Name;
	}

	private void setName(String name) {
		Name = name;
	}

	
	public Directory getDirectory() {
		return Directory;
	}

	private void setDirectory(Directory directory) {
		Directory = directory;
	}
	
	public Extension getExtension() {
		return Extension;
	}

	private void setExtension(Extension extension) {
		Extension = extension;
	}
	
	public java.io.File getThis() {
		java.io.File file = new java.io.File(Directory.getPath(), getFullName());
		return file;
	}
	
	public void create() {
		Directory.create();
		try {
			getThis().createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void rename(String newName) {
		java.io.File newf = new java.io.File(String.format("%s//%s.%s",getThis().getParent(), newName, Extension.toString()));
		getThis().renameTo(newf);
		setName(newName);
	}
	
	public void delete() {
		getThis().delete();
	}
	
	
	public String getFullName() {
		return String.format("%s.%s", Name, Extension);
	}
	
	public String getFullPath() {
		return String.format("%s\\%s", Directory.getPath(), getFullName());
	}
	
	
	public abstract void viewContent();
	
	public abstract void addContent(StringBuilder text);

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [Name=" + Name + ", Extension=" + Extension + ", Directory=" + Directory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Directory == null) ? 0 : Directory.hashCode());
		result = prime * result + ((Extension == null) ? 0 : Extension.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
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
		File other = (File) obj;
		if (Directory == null) {
			if (other.Directory != null)
				return false;
		} else if (!Directory.equals(other.Directory))
			return false;
		if (Extension != other.Extension)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
	
}
