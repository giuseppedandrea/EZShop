# Unit Testing Documentation

Authors: Jose Antonio Antona Diaz, Giuseppe D'Andrea, Marco Riggio, Gioele Scaletta

Date: 11/06/2021

Version: 1.1

# Contents

- [Black Box Unit Tests](#black-box-unit-tests)



- [White Box Unit Tests](#white-box-unit-tests)


# Black Box Unit Tests

    <Define here criteria, predicates and the combination of predicates for each function of each class.
    Define test cases to cover all equivalence classes and boundary conditions.
    In the table, report the description of the black box test case and (traceability) the correspondence with the JUnit test case writing the 
    class and method name that contains the test case>
    <JUnit test classes must be in src/test/java/it/polito/ezshop   You find here, and you can use,  class TestEzShops.java that is executed  
    to start tests
    >

    <We used a bottom-up testing strategy>

# Class UserImpl 

## Method setUsername

**Criteria for method *setUsername*:**

- username parameter is a valid String object or null

**Predicates for method *setUsername*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setUsername("gioele")<br/>getUsername().equals("gioele")<br/><br/>-> true | TestUserImpl.testSetUsername() |
| NULL                              | I               | setUsername("gioele")<br/>setUsername(null)<br/>getUsername().equals("gioele")<br/><br/>-> true (not modified) | TestUserImpl.testSetUsername() |


## Method setPassword

**Criteria for method *setPassword*:**

- password parameter is a valid String object or null

**Predicates for method *setPassword*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setPassword("scaletta")<br/>getPassword().equals("scaletta")<br/><br/>-> true | TestUserImpl.testSetPassword() |
| NULL                              | I               | setPassword("scaletta")<br/>setPassword(null)<br/>getPassword().equals("scaletta")<br/><br/>-> true (not modified) | TestUserImpl.testSetPassword() |


## Method setRole

**Criteria for method *setRole*:**

- role parameter is a valid String object or null

**Predicates for method *setRole*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | String admin_role="Administrator"<br/>setRole(admin_role)<br/>getRole().equals(admin_role)<br/><br/>-> true | TestUserImpl.testSetRole() |
| NULL                              | I               | String admin_role="Administrator"<br/>setRole(admin_role)<br/>setRole(null)<br/>getRole().equals(admin_role)<br/><br/>-> true (not modified) | TestUserImpl.testSetRole() |


## Method setId

**Criteria for method *setId*:**

- id parameter is a valid Integer object or null

**Predicates for method *setId*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                 | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setId(10)<br/>getId().equals(10)<br/><br/>-> true | TestUserImpl.testSetId() |
| NULL                              | I               | setid(10)<br/>setId(null)<br/>getId().equals(10)<br/><br/>-> true (not modified) | TestUserImpl.testSetId() |


## Method isAllowedRole



**Criteria for method *isAllowedRole*:**

- Validity of the String parameter


**Predicates for method *isAllowedRole*:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of the String parameter | Valid     |
|                                  | Invalid   |
|                                  | NULL      |
||Empty|


**Combination of predicates**:


|  Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-------|-------|-------|-------|
| Valid                            |  V                      | String admin_role="Administrator"  <br />isAllowedRole(admin_role) <br /><br />-> true|     testisAllowedRole()            |
| Invalid                          |  I                | String admin_role="administrator"  <br /> isAllowedRole(admin_role) <br /><br />-> false                 |  testisAllowedRole()  |
| Empty                            |  I               |  String admin_role=""  <br />isAllowedRole(admin_role) <br /><br />-> false                 |  testisAllowedRole()  |
| NULL                             |  I                |  String admin_role=null  <br /> isAllowedRole(admin_role) <br /><br />-> false                 |   testisAllowedRole()|


# Class ProductTypeImpl 

## Method setId

**Criteria for method *setId*:**

-id parameter is a valid Integer object or null

**Predicates for method *setId*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setId(10)<br/>getId().equals(10)<br/><br/>-> true | TestTestProductTypeImpl.testSetId() |
| NULL                              | I               | setid(10)<br/>setId(null)<br/>getId().equals(10)<br/><br/>-> true (not modified) | TestTestProductTypeImpl.testSetId() |

## Method setBarCode

**Criteria for method *setBarCode*:**

-barCode parameter is a valid String object or null

**Predicates for method *setBarCode*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setBarCode("5701234567899")<br/>getBarCode().equals("5701234567899")<br/><br/>-> true | TestProductTypeImpl.testSetBarCode() |
| NULL                              | I               | setBarCode("5701234567899")<br/>seBarCode(null)<br/>getBarCode().equals("5701234567899")<br/><br/>-> true (not modified) | TestProductTypeImpl.testSetBarCode() |

## Method setProductDiscountRate

**Criteria for method *setProductDiscountRate*:**

-discountRate parameter is a valid double object or null

**Predicates for method *setProductDiscountRate*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of double parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the double parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setProductDiscountRate(0.5)<br/>getProductDiscountRate().equals(0.5)<br/><br/>-> true | TestProductTypeImpl.testSetProductDiscountRate() |
| NULL                              | I               | setProductDiscountRate(0.5)<br/>seProductDiscountRate(null)<br/>getProductDiscountRate().equals(0.5)<br/><br/>-> true (not modified) | TestProductTypeImpl.testSetProductDiscountRate() |


## Method setProductDescription

**Criteria for method *setProductDescription *:**

-ProductDescription  parameter is a valid String object or null

**Predicates for method *setProductDescription*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setProductDescription ("spaghetti")<br/>getProductDescription().equals("spaghetti")<br/><br/>-> true | TestProductTypeImpl.testProductDescription() |
| NULL                              | I               | setProductDescription ("spaghetti")<br/>setProductDescription(null)<br/>getProductDescription().equals("spaghetti")<br/><br/>-> true (not modified) | TestProductTypeImpl.testSetProductDescription() |

## Method setPricePerUnit

**Criteria for method *setPricePerUnit*:**

-discountRate parameter is a valid double object or null

**Predicates for method *setPricePerUnit*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of double parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the double parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setPricePerUnit(0.5)<br/>getPricePerUnit().equals(0.5)<br/><br/>-> true | TestProductTypeImpl.testSetPricePerUnit() |
| NULL                              | I               | setPricePerUnit(0.5)<br/>setPricePerUnit(null)<br/>getPricePerUnit().equals(0.5)<br/><br/>-> true (not modified) | TestProductTypeImpl.testSetPricePerUnit() |

## Method setQuantity

**Criteria for method *setQuantity*:**

-quantity parameter is a valid Integer object or null

**Predicates for method *setQuantity*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setQuantity(10)<br/>getQuantity().equals(10)<br/><br/>-> true | TestProductTypeImpl.testSetQuantity() |
| NULL                              | I               | setQuantity(10)<br/>setQuantity(null)<br/>getQuantity().equals(10)<br/><br/>-> true (not modified) | TestProductTypeImpl.testSetQuantity() |

## Method setNote

**Criteria for method *setNote*:**

-note parameter is a valid String object or null

**Predicates for method *setNote*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter     | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setNote("barilla")<br/>getNote().equals("barilla")<br/><br/>-> true | TestProductTypeImpl.testSetNote() |
| NULL                              | I               | setNote("barilla")<br/>setNote(null)<br/>getNote().equals("barilla")<br/><br/>-> true (not modified) | TestProductTypeImpl.testSetNote() |

## Method setLocation

**Criteria for method *setLocation*:**

-location parameter is a valid String object or null

**Predicates for method *setLocation*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter     | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setLocation("0-a-1")<br/>getNote().equals("0-a-1")<br/><br/>-> true | TestProductTypeImpl.testSetLocation() |
| NULL                              | V               | setLocation("")<br/>setNote(null)<br/>getNote().equals("")<br/><br/>-> true (reset) | TestProductTypeImpl.testSetLocation() |


## Method isValidCode

**Criteria for method *isValidCode*:**

- Validity of length String parameter productCode
- Validity of digits type of String parameter productCode
- Validity of digits sum String parameter productCode
- Validity of String parameter


**Predicates for method *isValidCode*:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of length               | >=12 and <=14 |
|                                  | <12 or >14   |
| Validity of digits type         | is parsable Long   |
|                                  |nor parsable Long |
|Validity of digits sum            | Closest higher tens to sum calculation (x1 and x3), minus sum is equal to 3 |
|Validity of String parameter      | null|
|                                  |Empty|

**Combination of predicates**:


|  Validity of the String parameter |  Validity of length| Validity of digits type | Validity of digits sum  | Valid / Invalid | Description of the test case | JUnit test case |
|-------|-------|-------|-------|-------|-------|-------|
| Valid    |   >=12 and <=14     | is  parsable   | Valid   |  V                      | isValidCode("5701234567899") <br /><br />-> true   | testisValidCode ()|       
| *  |   *      |  *        | Invalid |  I                | isValidCode("111111111111") <br /><br />-> false                 |  testisValidCode () |
| *  |   *       |  is not parsable        | * |  I                | isValidCode("5701234a67899") <br /><br />-> false                 | testisValidCode ()|
| *  |   >=12 and <=14       |  *     | * |  I                | isValidCode("570167899") <br /><br />-> false | testisValidCode ()|
|Empty |   *      |  *       | * |  I                |isValidCode("")  <br /><br />-> false                 |   testisValidCode ()              |
|null |   *      |  *       | * |  I                | isValidCode(null)  <br /><br />-> false |   testisValidCode ()    |


## Method isValidLocation

**Criteria for method *isValidLocation*:**

- Validity of format ("number-character-number") String parameter location
- Validity of String parameter


**Predicates for method *isValidLocation*:**

| Criterion                        | Predicate |
| -------------------------------- | --------- |
| Validity of format               | format is "number-string-number" |
|                                  | wrong - usage or wrong element format (number/string)  |
|Validity of String parameter      | null|
|                                  |Empty|

**Combination of predicates**:


|  Validity of the String parameter |  Validity of format| Valid / Invalid | Description of the test case | JUnit test case |
|-------|-------|-------|-------|-------|
|Valid  | Valid format |  V | isValidLocation("3-a-2")  <br /><br />-> true | testisValidLocation ()|
|Valid  | Invalid format| I | isValidLocation("a-2-1") <br /> isValidLocation("1b-3") <br /><br />-> false  | testisValidLocation ()|
|Empty |   -    |  V              | isValidLocation("")  <br /><br />-> true  (location reset values)             |  testisValidLocation ()              |
|null  |  -     |  V              | isValidLocation(null)  <br /><br />-> true (location reset values)    |testisValidLocation ()|



# Class CustomerImpl

## Method setCustomerName

- customerName parameter is a valid String object or null

**Predicates for method *setCustomerName*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of String parameter                   | Valid      |
|                                               | NULL       |

**Combination of predicates**:


|  Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setCustomerName("Name2")<br/>getCustomerName( ).equals("Name2")<br/>->true| TestCustomerImpl.testCustomerName() |
|NULL                               |I                |setCustomerName(null)<br/>getCustomerName( ).equals("Name2")<br/>->true (not modified)| TestCustomerImpl.testCustomerName()|


## Method setCustomerCard

- customerCard parameter is a valid String object or null

**Predicates for method *setCustomerCard*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of String parameter                   | Valid      |
|                                               | NULL       |

**Combination of predicates**:


|  Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setCustomerCard("0123456789")<br/>getCustomerCard( ).equals("0123456789")<br/><br/>-> true| TestCustomerImpl.testCustomerCard() |
|NULL                               |I                |setCustomerCard("0123456789")<br/>setCustomerCard(null)<br/>getCustomerCard( ).equals("0123456789")<br/><br/>-> true (not modified)| TestCustomerImpl.testCustomerCard() |


## Method setId

- id parameter is a valid Integer object or null

**Predicates for method *setId*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of Integer parameter                  | Valid      |
|                                               | NULL       |

**Combination of predicates**:


| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setId(2)<br/>getId( ).equals(2)<br/><br/>-> true| TestCustomerImpl.testCustomerId()|
|NULL                               |I                |setId(2)<br/>setId(null)<br/>getId( ).equals(2)<br/><br/>-> true (not modified)|TestCustomerImpl.testCustomerId()|



## Method setPoints

- points parameter is a valid Integer object or null

**Predicates for method *setPoints*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of Integer parameter                  | Valid      |
|                                               | NULL       |

**Combination of predicates**:


| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setPoints(10)<br/>getPoints( ).equals(10)<br/><br/>-> true| TestCustomerImpl.testCustomerPoints() |
|NULL                               |I                |setPoints(10)<br/>setPoints(null)<br/>getPoints( ).equals(10)<br/><br/>-> true (not modified)| TestCustomerImpl.testCustomerPoints() |



# Class OrderImpl

## Method setOrderID

**Criteria for method *setOrderID*:**

-id parameter is a valid Integer object or null

**Predicates for method *setOrderID*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setOrderID(10)<br/>getOrderID().equals(10)<br/><br/>-> true | TestOrderImpl.testSetOrderID() |
| NULL                              | I               | setOrderID(10)<br/>setOrderID(null)<br/>getOrderID().equals(10)<br/><br/>-> true (not modified) | TestOrderImpl.testSetOrderID() |

## Method setBalanceId

**Criteria for method *setBalanceId*:**

-id parameter is a valid Integer object or null

**Predicates for method *setBalanceId*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setBalanceId(10)<br/>getBalanceId().equals(10)<br/><br/>-> true | TestOrderImpl.testBalanceId() |
| NULL                              | I               | setBalanceId(10)<br/>setBalanceId(null)<br/>getBalanceId().equals(10)<br/><br/>-> true (not modified) | TestOrderImpl.testSetBalanceId() |

## Method setProductCode

**Criteria for method *setProductCode*:**

-barCode parameter is a valid String object or null

**Predicates for method *setProductCode*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setProductCode("5701234567899")<br/>getProductCode().equals("5701234567899")<br/><br/>-> true | TestOrderImpl.testSetProductCode() |
| NULL                              | I               | setProductCode("5701234567899")<br/>setProductCode(null)<br/>getProductCode().equals("5701234567899")<br/><br/>-> true (not modified) | TestOrderImpl.testSetProductCode() |


## Method setPricePerUnit

**Criteria for method *setPricePerUnit*:**

-discountRate parameter is a valid Double object or null

**Predicates for method *setPricePerUnit*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Double parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Double parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setPricePerUnit(0.5)<br/>getPricePerUnit().equals(0.5)<br/><br/>-> true | TesOrderImpl.testSetPricePerUnit() |
| NULL                              | I               | setPricePerUnit(0.5)<br/>setPricePerUnit(null)<br/>getPricePerUnit().equals(0.5)<br/><br/>-> true (not modified) | TestOrderImpl.testSetPricePerUnit() |

## Method setQuantity

**Criteria for method *setQuantity*:**

-quantity parameter is a valid Integer object or null

**Predicates for method *setQuantity*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setQuantity(10)<br/>getQuantity().equals(10)<br/><br/>-> true | TestOrderImpl.testSetQuantity() |
| NULL                              | I               | setQuantity(10)<br/>setQuantity(null)<br/>getQuantity().equals(10)<br/><br/>-> true (not modified) | TestOrderImpl.testSetQuantity() |

## Method setStatus

**Criteria for method *setStatus*:**

-status parameter is a valid String object or null

**Predicates for method *setStatus*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setProductCode("ok")<br/>getProductCode().equals("ok")<br/><br/>-> true | TestOrderImpl.testSetStatus() |
| NULL                              | I               | setProductCode("ok")<br/>setProductCode(null)<br/>getProductCode().equals("ok")<br/><br/>-> true (not modified) | TestOrderImpl.testSetStatus() |




# Class SaleTransactionImpl

## Method setTicketNumber

**Criteria for method *setTicketNumber*:**

- setTicketNumber parameter is a valid Integer object or null

**Predicates for method *setTicketNumber*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of Integer parameter    | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the Integer parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setTicketNumber(10)<br/>getTicketNumber().equals(10)<br/><br/>-> true | TestSaleTransactionImpl.testSetTicketNumber() |
| NULL                              | I               | setTicketNumber(10)<br/>setTicketNumber(null)<br/>getTicketNumber().equals(10)<br/><br/>-> true (not modified) | TestSaleTransactionImpl.testSetTicketNumber() |

## Method setPrice

**Criteria for method *setPrice*:**

- price parameter is a valid double base type

**Predicates for method *setPrice*:**

| Criterion                                     | Predicate  |
| --------------------------------------------- | ---------- |
| Validity of double parameter                  | Valid      |

**Combination of predicates**:

|  Validity of the double parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setPrice(4.99)<br/>getPrice().equals(4.99)<br/><br/>-> true | TestSaleTransactionImpl.testSetPrice() |

## Method setDiscountRate

**Criteria for method *setDiscountRate*:**

- discountRate parameter is a valid double base type

**Predicates for method *setDiscountRate*:**

| Criterion                                     | Predicate  |
| --------------------------------------------- | ---------- |
| Validity of double parameter                  | Valid      |

**Combination of predicates**:

|  Validity of the double parameter | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setDiscountRate(0.15)<br/>getDiscountRate().equals(0.15)<br/><br/>-> true | TestSaleTransactionImpl.testSetDiscountRate() |

# Class TicketEntryImpl

## Method setBarCode

**Criteria for method *setBarCode*:**

- barCode parameter is a valid String object or null

**Predicates for method *setBarCode*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter     | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter  | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setBarCode("5701234567899")<br/>getBarCode().equals("5701234567899")<br/><br/>-> true | TestTicketEntryImpl.testSetBarCode() |
| NULL                              | I               | setBarCode("5701234567899")<br/>setBarCode(null)<br/>getBarCode().equals("5701234567899")<br/><br/>-> true (not modified) | TestTicketEntryImpltestSetBarCode() |

## Method setProductDescription

**Criteria for method *setProductDescription*:**

- productDescription parameter is a valid String object or null

**Predicates for method *setProductDescription*:**

| Criterion                        | Predicate  |
| -------------------------------- | ---------- |
| Validity of String parameter     | Valid      |
|                                  | NULL       |

**Combination of predicates**:

| Validity of the String parameter  | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setProductDescription("ZZZ")<br/>getProductDescription().equals("ZZZ")<br/><br/>-> true | TestTicketEntryImpl.testSetProductDescription() |
| NULL                              | I               | setProductDescription("ZZZ")<br/>setProductDescription(null)<br/>getBarCode().equals("ZZZ")<br/><br/>-> true (not modified) | TestTicketEntryImpl.testSetProductDescription() |

## Method setAmount

**Criteria for method *setAmount*:**

- amount parameter is a valid int base type

**Predicates for method *setAmount*:**

| Criterion                                     | Predicate  |
| --------------------------------------------- | ---------- |
| Validity of int parameter                     | Valid      |

**Combination of predicates**:

| Validity of the int parameter     | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setAmount(10)<br/>getAmount().equals(10)<br/><br/>-> true | TestTicketEntryImpl.testSetAmount() |

## Method setPricePerUnit

**Criteria for method *setPricePerUnit*:**

- pricePerUnit parameter is a valid double base type

**Predicates for method *setPricePerUnit*:**

| Criterion                                     | Predicate  |
| --------------------------------------------- | ---------- |
| Validity of double parameter                  | Valid      |

**Combination of predicates**:

| Validity of the double parameter  | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setPricePerUnit(2.49)<br/>getPricePerUnit().equals(2.49)<br/><br/>-> true | TestTicketEntryImpl.testSetPricePerUnit() |

## Method setDiscountRate

**Criteria for method *setDiscountRate*:**

- pricePerUnit parameter is a valid double base type

**Predicates for method *setDiscountRate*:**

| Criterion                                     | Predicate  |
| --------------------------------------------- | ---------- |
| Validity of double parameter                  | Valid      |

**Combination of predicates**:

| Validity of the double parameter  | Valid / Invalid | Description of the test case | JUnit test case |
| --------------------------------- | --------------- | ---------------------------- | --------------- |
| Valid                             | V               | setDiscountRate(0.50)<br/>getDiscountRate().equals(0.50)<br/><br/>-> true | TestTicketEntryImpl.testSetDiscountRate() |

# Class ReturnTransactionImpl

## Method setReturnId
**Criteria for method *setReturnId*:**

- returnId parameter is a valid Integer object or null

**Predicates for method *setReturnId*:**

| Criterion                        | Predicate  |
| -------------------------------- | -----------|
|Validity of Integer parameter     | Valid      |
|                                  | NULL       |

**Combination of predicates**:


|  Validity of the Integer parameter| Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setReturnId(100)<br/>getReturnId( ).equals(100)<br/><br/>-> true|testReturnTransactionImpl.testSetReturnId()|
|NULL                               |I                |setRetutnId(12)<br/>setReturnId(null)<br/>getReturnId( ).equals(12)<br/><br/>-> true(not modified)|testReturnTransactionImpl.testSetReturnId( )|


## Method setState

**Criteria for method *setState*:**

- state parameter is a valid String object or null
- value of the String object is INPROGRESS, CLOSED or PAYED

**Predicates for method *setState*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of String parameter                   | Valid      |
|                                               | NULL       |
|Value of String parameter                      | Empty      |
|                                               | INPROGRESS |
|                                               | CLOSED     |
|                                               | PAYED      |
|                                               | Other value|

**Combination of predicates**:


|  Validity of the String parameter |Value of String Parameter| Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-------------------------|-----------------|------------------------------|-----------------|
|NULL                               |*                        |I                |setState("INPROGRESS")<br/>setState(null)<br/>getState( ).equals("INPROGRESS")<br/><br/>-> true (not modified)|testReturnTransactionImpl.testSetState( )|
|Valid                              |Empty                    |I                |setState("")<br/><br/>-> exception thrown|testReturnTransactionImpl.testSetState( )|
|"                                 |INPROGRESS               |V                |setState("INPROGRESS")<br/>getState( ).equals("INPROGRESS")<br/><br/>-> true|testReturnTransactionImpl.testSetState( )|
|"                                  |CLOSED                   |V                |setState("CLOSED")<br/>getState( ).equals("CLOSED")<br/><br/>-> true|testReturnTransactionImpl.testSetState( )|
|"                                  |PAYED                    |V                |setState("PAYED")<br/>getState( ).equals("PAYED")<br/><br/>-> true|testReturnTransactionImpl.testSetState( )|
|"                                  |Other Value              |I                |setState("rAnDoM VaLuE")<br/><br/>-> exception thrown|testReturnTransactionImpl.testSetState( )|


## Method setAmount

**Criteria for method *setAmount*:**

- amount parameter is a valid Double object or null

**Predicates for method *setAmount*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of Double parameter                   | Valid      |
|                                               | NULL       |

**Combination of predicates**:


|  Validity of the Double parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setAmount(17.50)<br/>getAmount( ).equals(17.50)<br/><br/>->true|testReturnTransactionImpl.testSetAmount( )|
|NULL                               |I                |setAmount(22.30)<br/>setAmount(null)<br/>getAmount( ).equals(22.30)<br/><br/>-> true (not modified)|testReturnTransactionImpl.testSetAmount( )|

## Method setPaymentType

**Criteria for method *setPaymentType*:**

- paymentType parameter is a valid String object or null
- value of the String object is CARD or CASH

**Predicates for method *setPaymentType*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of String parameter                   | Valid      |
|                                               | NULL       |
|Value of String parameter                      | Empty      |
|                                               | CARD       |
|                                               | CASH       |
|                                               | Other value|

**Combination of predicates**:


|  Validity of the String parameter |Value of String Parameter| Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-------------------------|-----------------|------------------------------|-----------------|
|NULL                               |*                        |I                |setPaymentType("CARD")<br/>setPaymentType(null)<br/>getPaymentType( ).equals("CARD")<br/><br/>-> true (not modified)|testReturnTransactionImpl.testSetPaymentType( )|
|Valid                              |Empty                    |I                |setPaymentType("")<br/><br/>-> exception thrown|testReturnTransactionImpl.testSetPaymentType( )|
|"                                  |CARD                     |V                |setPaymentType("CARD")<br/>getPaymentType( ).equals(null)<br/><br/>-> true|testReturnTransactionImpl.testSetPaymentType( )|
|"                                  |CASH                     |V                |setPaymentType("CASH")<br/>getPaymentType( ).equals(null)<br/><br/>-> true|testReturnTransactionImpl.testSetPaymentType( )|
|"                                  |Other Value              |I                |setPaymentType("sOmE sTuFF")<br/><br/>-> exception thrown|testReturnTransactionImpl.testSetPaymentType( )|


# Class BalanceOperationImpl

## Method setBalanceId
**Criteria for method *setBalanceId*:**

- balanceId parameter is a valid int base type

**Predicates for method *setBalanceId*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of int parameter                      | Valid      |

**Combination of predicates**:


|  Validity of the int parameter    | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setBalanceId(27)<br/>getBalanceId( ).equals(27)<br/><br/>-> true|testBalanceOperationImpl.testSetBalanceId( )|

## Method setDate

**Criteria for method *setDate*:**

- date parameter is a valid LocalDate object or null

**Predicates for method *setDate*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of LocalDate parameter                | Valid      |
|                                               | NULL       |

**Combination of predicates**:


|Validity of the LocalDate parameter| Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |LocalDate l = LocalDate.now( )<br/>setLocalDate(l)<br/>getLocalDate( ).equals(l)<br/><br/>-> true|testBalanceOperationImpl.testSetDate( )|
|NULL                               |I                |LocalDate l = LocalDate.now( )<br/>setLocalDate(l)<br/>setLocalDate(null)<br/>getLocalDate( ).equals(l)<br/><br/>-> true (not modified)|testBalanceOperationImpl.testSetDate( )|

## Method setMoney

**Criteria for method *setMoney*:**

- money parameter is a valid double base type

**Predicates for method *setMoney*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of double parameter                   | Valid      |

**Combination of predicates**:


|  Validity of the double parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                | setMoney(23.50)<br/>getMoney( ).equals(23.50)<br/><br/>-> true|testBalanceOperationImpl.testSetMoney( )|


## Method setType

**Criteria for method *setType*:**

- type parameter is a valid String object or null

**Predicates for method *setType*:**

| Criterion                                     | Predicate  |
| ----------------------------------------------| -----------|
|Validity of String parameter                   | Valid      |
|                                               | NULL       |

**Combination of predicates**:


|  Validity of the String parameter | Valid / Invalid | Description of the test case | JUnit test case |
|-----------------------------------|-----------------|------------------------------|-----------------|
|Valid                              |V                |setType("CREDIT")<br/>getType( ).equals("CREDIT")<br/><br/>-> true|testBalanceOperationImpl.testSetType( )|
|NULL                               |I                |setType("CREDIT")<br/>setType(null)<br/>getType( ).equals("CREDIT")<br/><br/>-> true (not modified)|testBalanceOperationImpl.testSetType( )|

# Class ProductImpl

## Method isValidRFID

**Criteria for method *isValidRFID*:**

- Validity of length String parameter RFID
- Validity of digits type of String parameter RFID
- Validity of String parameter


**Predicates for method *isValidRFID*:**

| Criterion                        | Predicate         |
| -------------------------------- | ----------------- |
| Validity of String parameter     | Valid             |
|                                  | NULL              |
|                                  | Empty             |
| Validity of length               | Equal to 12       |
|                                  | Not equal to 12   |
| Validity of digits type          | Is parsable Long  |
|                                  | Not parsable Long |


**Combination of predicates**:


|  Validity of the String parameter |  Validity of length| Validity of digits type | Valid / Invalid | Description of the test case                      | JUnit test case   |
|-----------------------------------|--------------------|-------------------------|-----------------|---------------------------------------------------|-------------------|
| Valid                             |   Equal to 12      |  Is parsable Long       |  V              | isValidRFID("000000001000")  <br /><br />-> true  | TestProductImpl.testIsValidRFID() |
| *                                 |   *                |  Not parsable Long      |  I              | isValidRFID("00000000100a") <br /><br />-> false  | TestProductImpl.testIsValidRFID() |
| *                                 |   Not equal to 12  |  *                      |  I              | isValidRFID("00000000100") <br /><br />-> false   | TestProductImpl.testIsValidRFID() |
| NULL                              |   *                |  *                      |  I              | isValidRFID(null)  <br /><br />-> false           | TestProductImpl.testIsValidRFID() |
| Empty                             |   *                |  *                      |  I              | isValidRFID("")   <br /><br />-> false            | TestProductImpl.testIsValidRFID() |




## Method nextRFID

**Criteria for method *nextRFID*:**

- Validity of String parameter RFID


**Predicates for method *nextRFID*:**

| Criterion                            | Predicate         |
| ------------------------------------ | ----------------- |
| Validity of String parameter RFID    | Valid RFID        |
|                                      | Invalid RFID      |


**Combination of predicates**:


|  Validity of the String parameter RFID | Valid / Invalid | Description of the test case                      | JUnit test case   |
|----------------------------------------|-----------------|---------------------------------------------------|-------------------|
| Valid RFID                             |  V              | nextRFID("000000001009")  <br /><br />-> "000000001010" <br /><br /> nextRFID("999999999999")  <br /><br />-> "000000000000"     | TestProductImpl.testNextRFID()    |
| Invalid RFID                           |  I              | nextRFID(null) <br />nextRFID("") <br />nextRFID("00000000100a") <br />nextRFID("00000000100") <br /><br />-> null     | TestProductImpl.testNextRFID()    |


# White Box Unit Tests

### Test cases definition
    
    <JUnit test classes must be in src/test/java/it/polito/ezshop>
    <Report here all the created JUnit test cases, and the units/classes under test >
    <For traceability write the class and method name that contains the test case>


| Unit name | JUnit test case |
|:---------:|-------|
| UserImpl | testUserImpl.testCanManageUsers() |
|" | testUserImpl.testCanManageInventory()|
| " | testUserImpl.testCanManageAccounting() |
| " | testUserImpl.testCanManageCustomers() |
| " | testUserImpl.testManageSaleTransactions() |
| " | testUserImpl.testCanManagePayments() |
| " | testUserImpl.testCanListProducts() |
| ReturnTransactionImpl | testReturnTransactionImpl.testIsClosed() |
| " | testReturnTransactionImpl.testIsPayed() |
| " | testReturnTransactionImpl.testIsInProgress() |
| SaleTransactionImpl | testSaleTransactionImpl.testIsClosed() |
| " | testSaleTransactionImpl.testIsPayed() |
| " | testSaleTransactionImpl.testIsInProgress() |

### Code coverage report

![Coverage](./coverage_images/coverage.png)

### Loop coverage analysis

    <Identify significant loops in the units and reports the test cases
    developed to cover zero, one or multiple iterations >

|Unit name | Loop rows | Number of iterations | JUnit test case |
|---|---|---|---|
| ProductTypeImpl | 74-77 | 0 | testProductImpl.testisValidCode() |
| |  | 1+ | testProductImpl.testisValidCode() |




