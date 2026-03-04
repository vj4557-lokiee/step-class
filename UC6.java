import java.util.*;
class UC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UC6 ob=new UC6();
        String s1[] = ob.getOPattern();
        String s2[] = ob.getOPattern();
        String s3[] = ob.getPPattern();
        String s4[] = ob.getSPattern();
        for(int i=0;i<9;i++){
            System.out.print(s1[i]+" "+s2[i]+" "+s3[i]+" "+s4[i]);
            System.out.println();
        }
    }
    
    public String[] getOPattern()
    {

        String lines[] ={("   ***   "),
                         (" **   ** "),
                         ("**     **"),
                         ("**     **"),
                         ("**     **"),
                         ("**     **"),
                         ("**     **"),
                         (" **   ** "),
                         ("   ***   "),
        }; 
        return lines;
    }

    public String[] getPPattern()
    {
        String lines[]={("  ******  "),
                        (" **    ** "),
                        (" **     **"),
                        (" **    ** "),
                        (" ******   "),
                        (" **       "),
                        (" **       "),
                        (" **       " ),
                        (" **       ")};
        return lines;
    }

    public String[] getSPattern(){
        String lines[]={("    *****"),
                        ("  **"),
                        (" **"),
                        ("  **"),
                        ("    ***"),
                        ("       **"),
                        ("         **"),
                        ("        **"),
                        ("   *****")};
        return lines;
    }

}