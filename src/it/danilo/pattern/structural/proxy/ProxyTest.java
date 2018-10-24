package it.danilo.pattern.structural.proxy;

public class ProxyTest {
	
	public static void main(String[] args) {
		User user = new User("dev","dev");
		FolderProxy folderProxy = new FolderProxy(user);
		folderProxy.performOperations();
		
		User user2 = new User("abc","abc");
		FolderProxy folderProxy2 = new FolderProxy(user2);
		folderProxy2.performOperations();

	}

}
