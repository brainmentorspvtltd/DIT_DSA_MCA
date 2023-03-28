class SimpleUser {

}

class PrimeUser extends SimpleUser {

}

class SimpleLogin {
    SimpleUser show() {
        SimpleUser obj = new SimpleUser();
        return obj;
    }
}

class PrimeLogin extends SimpleLogin {
    @Override
    PrimeUser show() {
        PrimeUser obj = new PrimeUser();
        return obj;
    }
}

public class CovariantReturnType {
    
}
