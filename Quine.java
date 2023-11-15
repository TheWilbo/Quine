import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Quine
{
    public static void main(String[] args) throws IOException{
        int rand = (int)(Math.random()*100);
        String[] l = {
"import java.io.File;",
"import java.io.FileWriter;",
"import java.io.IOException;",
"public class Quine" + 1,
"{",
"    public static void main(String[] args) throws IOException{",
"        int rand = (int)(Math.random()*100);",
"        String[] l = {",
"        ",
"        };",
"        int adder = 0;",
"        if(l[3].length() >= 19){",
"            adder = 1 + Integer.parseInt(l[3].substring(18,l[3].length()));",
"        }",
"        char[] quine = {81,117,105,110,101};",
"        char[] java = {46,106,97,118,97};",
"        String javaS = new String(java);",
"        String quineS = new String(quine);",
"        File file = new File(quineS + adder + javaS);",
"        char quote = 34;",
"        char cr = 13;",
"        char lf = 10;",
"        char comma = 44;",
"        file.createNewFile();",
"        FileWriter wrute = new FileWriter(quineS + adder + javaS);",
"        //adder--;",
"        l[3] = l[3].substring(0,18)+adder;",

"        for(int i = 0; i < 8; i++){",
"            wrute.write(l[i] + cr + lf);",
"        }",

"        //char[] discrim = {32,43,32,114,97,110,100};",
"        //String discrimS = new String(discrim);",
"        //l[3] = l[3].substring(0,18) + discrimS;",
"        for(int i = 0; i < l.length; i++){",
"            wrute.write(l[8] + quote + l[i] + quote + comma + cr + lf);",
"        }",
"        for (int i = 9; i < l.length; i++)    // Print this code",
"            wrute.write(l[i] + cr + lf);",
"        wrute.close();",
"    }",
"}"
};      
        int adder = 0;
        if(l[3].length() >= 19){
            adder = Integer.parseInt(l[3].substring(18,19));
        }
        char[] quine = {81,117,105,110,101}; 
        char[] java = {46,106,97,118,97};
        String javaS = new String(java);
        String quineS = new String(quine);
        File file = new File(quineS + adder + javaS);
        char quote = 34;
        char cr = 13;
        char lf = 10;
        char comma = 44;
        file.createNewFile();
        FileWriter wrute = new FileWriter(quineS + adder + javaS);
        //adder--;
        l[3] = l[3].substring(0,18)+adder;
        for(int i = 0; i < 8; i++){
            wrute.write(l[i] + cr + lf);
        }
        
        // char[] discrim = {92,34,32,43,32,114,97,110,100};
        // String discrimS = new String(discrim);
        // l[3] = l[3].substring(0,18) + discrimS;
        for(int i = 0; i < l.length; i++){
            wrute.write(l[8] + quote + l[i] + quote + comma + cr + lf);
        }
        for (int i = 9; i < l.length; i++)    // Print this code
            wrute.write(l[i] + cr + lf);
        wrute.close();
    }
}