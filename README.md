## Calculator

This simple calculator demonstrates testing in Java using TestNG with a `Calculator` class.

- Basic calculator operations:
    - `add(int a, int b)`
    - `subtract(int a, int b)`
    - `multiply(int a, int b)`
    - `divide(int a, int b)` — throws an exception when dividing by zero
- TestNG tests:
    - Parameterized tests using `@DataProvider`
    - Method dependency via `dependsOnMethods`
    - Annotations: `@BeforeClass`, `@AfterClass`, `@BeforeMethod`, `@AfterMethod`
    - Custom listener using `ITestListener` for logging test results

---

#### To Run Tests

Use the following command to run the tests in the console:

mvn clean test