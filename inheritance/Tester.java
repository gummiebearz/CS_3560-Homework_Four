public class Inheritance {
    public static void main(String[] args) {
        SalariedEmployee salEmp1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        salEmp1.display();

        HourlyEmployee hourEmp1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        hourEmp1.display();

        HourlyEmployee hourEmp2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        hourEmp2.display();

        CommissionEmployee comEmp1 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        comEmp1.display();

        SalariedEmployee salEmp2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        salEmp2.display();

        BaseEmployee baseEmp = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        baseEmp.display();

        CommissionEmployee comEmp2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);
        comEmp2.display();
    }
}
