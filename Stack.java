public class MyClass {
    int top;
    int n=5;
    int a[]= new int[n];
    MyClass()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return top<0;
    }
    boolean push(int x)
    {
        if(top>=(n-1))
        {
            System.out.println("Stack overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println(x+" Push Element");
            return true;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack is Underflow");
            return 0;
        }
        else
        {
            int x= a[top--];
            return x;
        }
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        else
        {
            int x=a[top];
            return x;
        }
    }
    void display()
    {
        if(top<0)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(a[i]+" Stack Element");
            }
        }
    }
    public static void main(String args[]) {
     MyClass obj=new MyClass();
     obj.push(1);
     obj.push(2);
     obj.push(3);
        obj.pop();
     System.out.println(obj.peek()+" Top Element");
     obj.display();
    }
}
