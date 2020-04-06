public class InistituteSW {
    String instituteName;
    String courseName;
    String[] snames;
    int[] smarks;
    int batchSize;

    //Constructor of type parameterized - is used for initializing required / necessary class members
    //Compiler thinks that you have written a constructor for your custom purpose.. so wont add default one
    //public InstituteSW(){super(); } -- Default constructor is not written by compiler

    public InistituteSW(String instituteName, String courseName, int batchSize){
        super(); //what if we dont write this super? no issues, compiler will add it automatically..

        this.instituteName = instituteName;
        this.courseName = courseName;
        this.batchSize = batchSize;

        smarks = new int[batchSize];
        snames = new String[batchSize];
    }

    public void registerStudents(){
        for(int s=0; s<batchSize; s++){
            System.out.print("Enter the name of student-" + (s+1) + ": ");
            snames[s] = System.console().readLine();
        }
        System.out.println(batchSize + " students are registered successfully to " + courseName + " course");
    }

    public void assignStudentMarks(){
        for(int s=0; s<smarks.length; s++){
            System.out.print("Enter the marks of " + snames[s] + ": ");
            smarks[s] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("--- All the students of " + courseName + " course are assigned with marks ---");
    }

    public void printStudentResults(){
        for(int s=0; s<snames.length; s++){
            if(smarks[s] >= 75)
                System.out.println("Result of " + snames[s] + " is: Distinction");
            else if(smarks[s] >= 60)
                System.out.println("Result of " + snames[s] + " is: First Division");
            else if(smarks[s] >= 50)
                System.out.println("Result of " + snames[s] + " is: Second Division");
            else if(smarks[s] >= 40)
                System.out.println("Result of " + snames[s] + " is: Third Division");
            else
                System.out.println("Result of " + snames[s] + " is: Failed");
        }
    }
}
