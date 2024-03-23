import java.io.File;
import java.util.Scanner;

public class Ex9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("File Operations Menu:");
            System.out.println("1. Open an existing file");
            System.out.println("2. Create a new file");
            System.out.println("3. Rename a file");
            System.out.println("4. Delete a file");
            System.out.println("5. Create a directory");
            System.out.println("6. Find the absolute path of a file");
            System.out.println("7. Get file names in a directory");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    openFile(scanner);
                    break;
                case 2:
                    createFile(scanner);
                    break;
                case 3:
                    renameFile(scanner);
                    break;
                case 4:
                    deleteFile(scanner);
                    break;
                case 5:
                    createDirectory(scanner);
                    break;
                case 6:
                    findAbsolutePath(scanner);
                    break;
                case 7:
                    getFileNamesInDirectory(scanner);
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);
    }

    private static void openFile(Scanner scanner) {
        System.out.print("Enter the file name to open: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            System.out.println("File opened successfully.");
        } else {
            System.out.println("File not found or is a directory.");
        }
    }

    private static void createFile(Scanner scanner) {
        System.out.print("Enter the file name to create: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists or an error occurred.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void renameFile(Scanner scanner) {
        System.out.print("Enter the current file name: ");
        String currentFileName = scanner.nextLine();
        File currentFile = new File(currentFileName);

        if (!currentFile.exists() || currentFile.isDirectory()) {
            System.out.println("File not found or is a directory.");
            return;
        }

        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine();
        File newFile = new File(newFileName);

        if (currentFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File not found or is a directory.");
        }
    }

    private static void createDirectory(Scanner scanner) {
        System.out.print("Enter the directory name to create: ");
        String directoryName = scanner.nextLine();
        File file = new File(directoryName);

        if (file.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create the directory.");
        }
    }

    private static void findAbsolutePath(Scanner scanner) {
        System.out.print("Enter the file name to find the absolute path: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("Absolute path: " + file.getAbsolutePath());
        } else {
            System.out.println("File not found.");
        }
    }

    private static void getFileNamesInDirectory(Scanner scanner) {
        System.out.print("Enter the directory path to get file names: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            String[] fileNames = directory.list();
            System.out.println("File names in the directory:");
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
        }else {
            System.out.println("Directory not found or is not a directory.");
        }
    }
}

