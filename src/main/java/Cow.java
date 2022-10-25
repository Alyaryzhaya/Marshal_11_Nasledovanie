public class Cow  extends Animal {

    public Cow(String say, int teeth) {  // конструктор с параметрами
        setSay(say);
        setTeeth(teeth);
    }

    // Переопределение метода getSay
    public String getSay() {
        String say = super.getSay(); // забираем результат изнаального метода тобы с ним тото сделать
        return say + " New!"; // теперь он работает не так как супер-классе, а так как нам нужно конкретно для коровы



    }


    void mu() {  //  метод му
        System.out.println(getSay() + " во все " + getTeeth() + " зуба") ;

    }


    }

