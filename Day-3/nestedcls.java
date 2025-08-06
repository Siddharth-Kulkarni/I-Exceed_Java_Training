
//NESTED CLASS!


class karnataka{
    String cap="BLR";
    int dist=31;

    public void disp(){
        System.out.println("num of dist= "+dist);
        System.out.println("Cap is "+cap);
    }

    class blr{
        String coll_name;
        int area_dist;

        blr(String coll_name,int area_dist){
            this.coll_name=coll_name;
            this.area_dist=area_dist;
        }

        public void dispblr(){
            System.out.println("Name of collector= "+coll_name);
            System.out.println("District area= "+area_dist);
        }
    }
}

public class nestedcls {
    public static void main(String[] args) {

        karnataka ka=new karnataka();
        ka.disp();


        //THIS IS THE WAY TO ACCESS THE NESTED CLASS BY CREATING AN OBJECT

        karnataka.blr beng=new karnataka().new blr("name",74348);

        //or since i have created an obj for karnataka seperately the syntax can also be

        //karnataka.blr beng=ka.new blr("name",74348);

        
        beng.dispblr();
    }
}
