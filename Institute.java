public class Institute {
    public static void main(String[] args){
        System.out.println("------- Welcome to Institute Mangement System ------");

        System.out.print("Enter your Institute Name: ");
        String instituteName = System.console().readLine();

        System.out.print("Enter the course name to register students: ");
        String courseName = System.console().readLine();

        System.out.print("What is the Batch Size of " + courseName + " Course: ");
        int batchSize = Integer.parseInt(System.console().readLine());


        InistituteSW insSW = new InistituteSW(instituteName, courseName, batchSize);

        insSW.registerStudents(); //registeres all the students by asking their names to the course

        System.out.println("---3 months completed. Course is over. Exams are done.. taking marks---");
        insSW.assignStudentMarks(); //this will ask and assign marks to all students

        System.out.println("--- marks analysis is completed. Printing Results -----");
        insSW.printStudentResults(); //analyze result based on marks and prints it

        System.out.println("------- Thanks for using Institute Mangement System ------");

    }
}
