# Interface Exercise

An interface specifies the capabilities of an object, or what the object can do.

The `Payable` interface defines payment-related behaviors. Different classes such as `Freelancer` and `VendorInvoice` can implement `Payable` because both are capable of calculating a payment and providing a payee name.

## Program Output

```
INTERFACE EXERCISE
==================
Freelancer:
-----------
Payee: Alex Carter
Payment: $1050.00

Freelancer:
-----------
Payee: Maya Nguyen
Payment: $1372.00

Vendor Invoice:
---------------
Vendor: Pacific Office Supply
Invoice Number: INV-1001
Payment: $1250.75

Vendor Invoice:
---------------
Vendor: Tech Solutions LLC
Invoice Number: INV-1002
Payment: $3480.00

===> Total Payout: $7152.75
```

### Program Error Output

```
Error adding Freelancer: Rate must be non-negative
Error adding Freelancer: Hours worked must be non-negative
Error adding Vendor Invoice: Amount due must be non-negative
Error adding Vendor Invoice: Amount due must be non-negative
```
