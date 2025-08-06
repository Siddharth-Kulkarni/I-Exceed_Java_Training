

/*When we use static keyword and if there is any operations to be
performed or happen then the changes can be seen where as if use without static 
then the changes wont occur
 * 
 */
public class static_eg {
    static int i;

    int x;

    static_eg(){
        i++;
        System.out.println("From static_int :"+i);


        x++;
        System.out.println("From int :"+x);
    }

    public static void main(String[] args) {

        static_eg statobj1=new static_eg();
        static_eg statobj2=new static_eg();
       
    }
}
