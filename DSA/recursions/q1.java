class q1
{
    static int count = 0;
    static void print(){
        if(count==3)
        return;
        System.out.println(count);
        count = count+1;
        print();
    
    }
    public static void main(String[] args) 
    {
        print();
    }
}