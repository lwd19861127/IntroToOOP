package twoDimensional;

public class twoDimension {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // get the sum of the first row
        int firstRowSum = data[0][0] + data[0][1] + data[0][2];
        System.out.println(firstRowSum);

        //get the number of rows
        System.out.println(data.length);

        //get the number of cols in the first row
        System.out.println(data[0].length);

        //create a two-dimensional array with the size
        // {{x, x, x, x},{x, x, x, x}}
        String[][] students = new String[2][4];
        students[0][0] = "Rick";
        students[0][1] = "Richard";
        students[0][2] = "Mika";
        students[0][3] = "Bianca";
        students[1][0] = "Yuka";
        students[1][1] = "Yusuke";
        students[1][2] = "Anzu";
        students[1][3] = "Wenda";

        for(int i = 0; i < students.length; i++) {
            for(int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }

        //for-each loop
        //"for each row in students, for each student in row, ..."
        for(String[] row: students) {
            for(String student: row) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
