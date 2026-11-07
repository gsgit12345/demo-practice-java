package org.example.designpattern.creational.Commanddesign;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowFileSystemReceiver();
        }else if(osName.contains("Windows")){
            return new UnixFileSystemReceiver();
        }else
        {
            return new MacFileSystemReceiver();

        }
    }

}

