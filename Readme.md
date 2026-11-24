
# UI Test Automation Framework

A scalable and reusable UI Test Automation Framework built using **Java, Selenium WebDriver, TestNG, and Maven**, following the Page Object Model (POM) design pattern.
This framework is designed to automate end-to-end e-commerce application workflows, improve test coverage, support cross-browser execution, and simplify test maintenance.

## 🚀 Tech Stack

| Technology | Purpose |
|---|---|
| Java 24 | Programming Language |
| Selenium WebDriver 4.35 | Browser Automation |
| TestNG 7.11 | Test Execution & Test Management |
| Maven | Build & Dependency Management |
| Page Object Model (POM) | Framework Design Pattern |
| Apache POI | Excel-Based Test Data |
| ExtentReports | HTML Test Reporting |
| Log4j | Logging |
| Gson | JSON Data Handling |
| OpenCSV | CSV Data Handling |
| LambdaTest | Cloud-Based Cross-Browser Testing |
| Git & GitHub | Version Control |
| GitHub Actions | CI/CD Automation |

## 📌 Key Features

- **Page Object Model (POM):** Maintainable and reusable page classes.
- **Cross-Browser Testing:** Supports Chrome and configurable browser execution.
- **Data-Driven Testing:** Reads test data from Excel files.
- **Parallel Execution:** Executes multiple test cases using TestNG.
- **Headless Execution:** Supports browser execution without a visible UI.
- **Cloud Execution:** Supports remote browser execution using LambdaTest.
- **Reusable Utilities:** Common methods for browser setup, waits, screenshots, and other operations.
- **Explicit Waits:** Handles dynamic web elements reliably.
- **TestNG Groups:** Supports Smoke and Regression test suites.
- **ExtentReports:** Generates detailed HTML execution reports.
- **Logging:** Maintains execution logs using Log4j.
- **Screenshot Capture:** Helps investigate failed test cases.

## 🏗️ Project Structure

```text
UI_TestAutomation_Framework/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/
│   │       │   ├── LoginPage.java
│   │       │   ├── HomePage.java
│   │       │   ├── ProductPage.java
│   │       │   ├── CartPage.java
│   │       │   └── CheckoutPage.java
│   │       │
│   │       └── utility/
│   │           ├── BrowserUtility.java
│   │           ├── ConfigReader.java
│   │           ├── ExcelReader.java
│   │           ├── ScreenshotUtility.java
│   │           └── WaitUtility.java
│   │
│   └── test/
│       └── java/
│           └── tests/
│               ├── LoginTest.java
│               ├── ProductTest.java
│               ├── CartTest.java
│               └── CheckoutTest.java
│
├── testData/
│   └── UserData.xlsx
│
├── logs/
│   └── automation.log
│
├── reports/
│   └── report.html
│
├── testng.xml
├── pom.xml
└── README.md
```

*Note: The structure above represents the framework's logical organization. Adjust package and file names to match your actual repository.*

## ⚙️ Prerequisites

Make sure the following tools are installed:

- Java JDK 24
- Apache Maven
- IntelliJ IDEA / Eclipse
- Git
- Chrome Browser
Verify Java:
```bash
java -version
```
Verify Maven:
```bash
mvn -version
```

## 🔧 Installation & Setup

**1. Clone the repository**
```bash
git clone https://github.com/ChethanGowda99/UI_TestAutomation_Framework.git
```
**2. Navigate to the project directory*
```bash
cd UI_TestAutomation_Framework
```
**3. Install project dependencies**
```bash
mvn clean install
```
## ▶️ Test Execution

### 1. Execute all test cases
```bash
mvn clean test
```
### 2. Execute tests using Chrome
```bash
mvn clean test -Dbrowser=chrome
```
### 3. Execute tests in Headless Mode
```bash
mvn clean test -Dbrowser=chrome -DisHeadless=true
```
### 4. Execute tests on LambdaTest
```bash
mvn clean test -Dbrowser=chrome -DisLamdatest=true
```
### 5. Execute tests locally
```bash
mvn clean test -Dbrowser=chrome -DisLamdatest=false -DisHeadless=false
```

**Note:** Execution parameters must match the names configured in your Maven Surefire plugin and TestNG XML configuration.

## 🧪 Test Scenarios Covered
The framework covers major e-commerce application workflows:

| Module | Test Scenarios |
|---|---|
| Login | Valid Login, Invalid Login |
| Products | Product Search, Product Selection |
| Cart | Add to Cart, Remove from Cart |
| Checkout | Checkout Information, Order Placement |
| Orders | Order Verification |

## 📊 Reporting
The framework integrates ExtentReports to generate detailed HTML reports.
Reports provide:
- Total test cases executed.
- Passed, failed, and skipped test cases.
- Test execution status.
- Failure details.
- Execution logs.
- Screenshots for debugging.
Generated reports and logs can be accessed from the configured report and log directories.

## 🔄 CI/CD Integration
The framework supports automated execution through GitHub Actions.
CI/CD workflow can be configured to:
1. Trigger automation on code push or pull requests.
2. Set up the required Java environment.
3. Install Maven dependencies.
4. Execute TestNG test suites.
5. Generate execution reports.
6. Upload reports and logs as workflow artifacts.

## 🎯 Framework Design Approach
The framework follows a layered architecture:
**1. Test Layer**
- Contains TestNG test classes.
- Handles test execution and assertions.
- Organizes test cases using TestNG groups.
**2. Page Layer**
- Implements Page Object Model.
- Maintains web elements and page-specific actions.
- Promotes code reusability.
**3. Utility Layer**
- Browser initialization and configuration.
- Explicit wait handling.
- Excel data reading.
- Screenshot capture.
- Common reusable methods.
**4. Reporting & Logging Layer**
- ExtentReports for HTML reporting.
- Log4j for execution logging.

## 🔮 Future Enhancements
- Integrate API automation using REST Assured.
- Enhance CI/CD pipeline execution.
- Add more browser coverage.
- Implement advanced parallel execution.
- Integrate additional test data management.
- Explore AI-assisted test automation.
- Expand cloud-based browser execution.

## 👨‍💻 Author
**Chethan M S**
A Automation Engineer | Selenium | Java | TestNG | API Testing
GitHub: [ChethanGowda99](https://github.com/ChethanGowda99)
Project Repository: [UI_TestAutomation_Framework](https://github.com/ChethanGowda99/UI_TestAutomation_Framework)
⭐ If you find this project useful, feel free to explore the repository and provide feedback.
