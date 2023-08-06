

import java.util.ArrayList;

class Customer {
    private String name;
    private String id;
    private int age;
    private double balance;

    public Customer(String name, String id, int age, double balance) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Age: " + age + ", Balance: " + balance;
    }
}

class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String name, String id, int age, double balance)
            throws DuplicateCustomerException, InvalidAgeException, LowBalanceException {
        // Check if customer ID already exists
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                throw new DuplicateCustomerException("Customer with ID " + id + " already exists.");
            }
        }

        // Validate age
        if (age < 18 || age > 65) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age should be between 18 and 65 (inclusive).");
        }

        // Validate balance
        if (balance <= 0) {
            throw new LowBalanceException("Initial balance should be greater than 0.");
        }

        Customer newCustomer = new Customer(name, id, age, balance);
        customers.add(newCustomer);
    }

    public Customer searchCustomer(String id) throws InvalidCustomerIDException {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }

        throw new InvalidCustomerIDException("Customer with ID " + id + " does not exist.");
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}

class DuplicateCustomerException extends Exception {
    public DuplicateCustomerException(String errorMessage) {
        super(errorMessage);
    }

    @Override
    public String toString() {
        return "DuplicateCustomerException: " + getMessage();
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }

    @Override
    public String toString() {
        return "InvalidAgeException: " + getMessage();
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String errorMessage) {
        super(errorMessage);
    }

    @Override
    public String toString() {
        return "LowBalanceException: " + getMessage();
    }
}

class InvalidCustomerIDException extends Exception {
    public InvalidCustomerIDException(String errorMessage) {
        super(errorMessage);
    }

    @Override
    public String toString() {
        return "InvalidCustomerIDException: " + getMessage();
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        

        try {
            bank.addCustomer("John Doe", "1234", 25, 1000);
            bank.addCustomer("Jane Smith", "5678", 30, 500);
            bank.searchCustomer("1234");
            bank.printCustomers();
            // bank.addCustomer("Bob Brown", "1234", 40, 2000); This should throw DuplicateCustomerException
        }
        catch (DuplicateCustomerException | InvalidAgeException | LowBalanceException | InvalidCustomerIDException e) {
            System.out.println(e.toString());
        }

    }
}


