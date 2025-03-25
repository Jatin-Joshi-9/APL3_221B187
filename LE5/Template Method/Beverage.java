abstract class Beverage{
    private void pour(int quantity){
        System.out.println("Pour "+quantity+"ml of Beverage in the Glass");
    }
    protected abstract void addCondiments();
    protected void stir(){}
    private void serve(){
        System.out.println("Serve it through Waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiments();
        stir();
        serve();
    }
}