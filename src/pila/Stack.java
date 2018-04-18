package pila;
import java.io.*;

public class Stack 
{
    nodo head = null;
	
    public boolean isEmpty()
    {
        return head == null ? true : false;
    }
	
    public void Push(nodo newnodo)
    {
        newnodo.next = head;
	head = newnodo;
    }
	
    public String Pop()
    {
        nodo temp = head;
	head = head.next;
        String info = temp.toString();
        temp=null;
        System.gc();
        return info;
    }

    public String Peek()
    {
        nodo temp = head;
	String info = temp.toString();	
        return info;
    }
	
    public void printStack()
    {	
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
	try
        {   
            bw.write("Grades: \n");
            
            while(!isEmpty())
		bw.write(Pop());
        	bw.flush();
	}
        catch(Exception ex) {ex.printStackTrace();}
    }
	
    public static void main(String[] args) 
    {
        Stack grades = new Stack();
	grades.Push(new nodo("task1",3.5));
        grades.Push(new nodo("quiz1",3.6));
	grades.Push(new nodo ("test1",0.5));
        grades.Push(new nodo("testx",8));
	grades.Pop();
        grades.Peek();
        grades.printStack();
    }
}

