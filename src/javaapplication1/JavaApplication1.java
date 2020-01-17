/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author patel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              char[] pillBox1=new char[7];
        
        pillBox1[0]='s';
        pillBox1[1]='t';
        pillBox1[2]='u';
        pillBox1[3]='d';
        pillBox1[4]='e';
        pillBox1[5]='n';
        pillBox1[6]='t';
        
        for(int i=0;i<=pillBox1.length-1;i++)
        {
            System.out.println(pillBox1[i]);
        }
    }
    
}
