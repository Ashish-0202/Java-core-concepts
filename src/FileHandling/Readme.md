**File Handling in Java**

File Handling in java allows us to perform certain operation with file such as creating a file, reading a file, writing into the file and many more.

***

**Stream**

Stream is a sequence of data.
On the basis of IO package in java, all the classes are divided into two streams
* Byte
* Character

***
Methods in File handling:
* createNewFile()
* canRead() : Boolean
* canWrite() : Boolean
* delete()
* exists()
* length()
* getName()
* getAbsolutePath()
* mkdir()
* list()
* Read()
* Write()
* RenameTo()

* **Note**: While dealing with file handling operations we need to handle the exception as well.
 
There are two ways to handle the exception:
* Using try-catch block.
* Using throws keyword.
***
**File Handling classes**:
* File
* FileReader
* FileWriter
* FileInputStream
* FileOutputStream
* BufferedInputStream
* BufferedOutputStream
***
**FileWriter:**

Java FileWriter class of java.io package is used to write data in character form to file. Java FileWriter class is used to write character-oriented data to a file. It is a character-oriented class that is used for file handling in java.

* FileWriter is meant for writing streams of characters. For writing streams of raw bytes, consider using a FileOutputStream.
* FileWriter creates the output file if it is not present already.

  
    FileWriter file=new FileWriter("\\path\\to\\file\\filename.txt");
    file.write("Java is a powerful programming language");
We can also use FileOutputStream or bufferedOutputStream classes to write into the file.

Note: FileOutputStream is used to write stream of bytes into the file.
***

**FileReader:**

FileReader will create a new FileReader, given the File to read from.

    FileReader fr=new FileReader("\\path\\filename.txt");
    int i;
    while((i=fr.read)!= -1){
    System.out.println((char)i);
    }

We can also use the FileInputStream method or BufferedInputStream to read from a file.

Note: FileInputStream is useful to read data from a file in the form of sequence of bytes. FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
***
