import java.io.*;
//totalmarks and percentage using array
class TotalMarks
 {
  public static void main(String arg[])throws IOException
{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.print("How Many Subjects: ");
int n = Integer.parseInt(br.readLine());

int[] marks = new int[n];

for(int i=0;i<n;i++)
{
 System.out.print("Enter Marks: ");
 marks[i] = Integer.parseInt(br.readLine());
}

int tot = 0;
for(int i=0;i<n;i++)

 tot += marks[i];
 System.out.println("Total Marks: "+tot);
 
float percent = (float)tot/n;
System.out.println("percentage = "+ percent);

}
}
 