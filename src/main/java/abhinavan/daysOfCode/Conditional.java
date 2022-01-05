package abhinavan.daysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
* */

public class Conditional
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N%2 != 0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(N>=2 && N <= 5)
            {
                System.out.println("Not Weird");
                return;
            }
            if(N>=6 && N <= 20)
            {
                System.out.println("Weird");
                return;
            }
            else
            {
                System.out.println("Not Weird");
                return;
            }
        }
        bufferedReader.close();
    }
}
