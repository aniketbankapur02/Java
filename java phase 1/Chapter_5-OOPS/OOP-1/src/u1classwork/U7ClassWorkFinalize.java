package u1classwork;
/*
 finalize method is used in class mehtod it helps to perform actions when objects are destroyed by GC
 when object is unused it is destroyed
 */
class Student{
    int a;

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("you can write any code. code will work when object is freed and it is destroyed");
    }
}

public class U7ClassWorkFinalize {
    public static void main(String[] args) {
        // demo program when object is freeed and destroyed
        // we can free it easy when we have to give load by allocating lot of objects in heap then only it will destroy unused objects

        for (int i = 0; i < 10000000; i++) {
            Student ref_var = new Student();// for evry loop it will create new object and old object is unused so it iwll diestroyed when there is load
        }
    }
}
