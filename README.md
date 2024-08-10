# 📰 News - Kotlin Daily Fake News Generator

## Overview

**News** is a Kotlin-based project that automatically generates a fake news article every day. These articles are neatly organized in a folder structure within the repository: `docs/year/month`, with each file named `day-month-year.md`. This ensures that your GitHub contribution graph stays green and active every single day!

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Folder Structure](#folder-structure)
- [Automation](#automation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

- 🗞️ **Daily Fake News**: Generates a new fake news article every day using Kotlin.
- 📅 **Organized Folder Structure**: Automatically organizes articles by year and month.
- 🟢 **Keep GitHub Green**: Ensures your GitHub activity stays consistent.
- ⚙️ **Fully Automated**: Set it up once, and it runs daily without manual intervention.

## Installation

To get started with **News**, follow these steps:

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/news.git
    cd news
    ```

2. **Install dependencies**:
   Ensure you have Kotlin and Gradle installed. Then, run:
    ```bash
    ./gradlew build
    ```

3. **Run the generator**:
    ```bash
    ./gradlew run
    ```

## Usage

### Manual Execution

You can manually generate a fake news article by running:

```bash
./gradlew run
```

This command creates a markdown file in the `docs/year/month` directory with the name `day-month-year.md`, containing the daily fake news article.

### Automated Execution

To ensure a new article is generated daily, you can set up a cron job or automate it using a CI/CD pipeline:

- **Cron Job (Linux/MacOS)**:
    ```bash
    0 0 * * * cd /path-to-your-repo/news && ./gradlew run
    ```

- **GitHub Actions**:
  Here's a sample GitHub Actions workflow to automate the process:

    ```yaml
    name: Generate Daily Fake News

    on:
      schedule:
        - cron: '0 0 * * *'

    jobs:
      build:
        runs-on: ubuntu-latest

        steps:
        - name: Checkout repository
          uses: actions/checkout@v2

        - name: Set up JDK
          uses: actions/setup-java@v2
          with:
            distribution: 'temurin'
            java-version: '11'

        - name: Build and Run
          run: |
            ./gradlew build
            ./gradlew run

        - name: Commit and push changes
          run: |
            git config --local user.email "your.email@example.com"
            git config --local user.name "Your Name"
            git add .
            git commit -m "Add daily fake news article"
            git push
    ```

## Folder Structure

The generated news articles are organized as follows:

```
news/
├── docs/
│   ├── 2024/
│   │   ├── 08/
│   │   │   ├── 10-08-2024.md
│   │   │   ├── 11-08-2024.md
│   │   │   └── ...
│   ├── 2023/
│   │   ├── 12/
│   │   │   ├── 25-12-2023.md
│   │   │   └── ...
│   └── ...
```

Each `.md` file contains a fake news article generated on that specific day.

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature/your-feature-name`).
6. Open a pull request.

Please ensure that your code adheres to Kotlin best practices and is well-documented.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

Feel free to reach out with any questions or feedback:

- **Jur Wind**: [dev@jurwind.nl](mailto:dev@jurwind.nl)
- [GitHub](https://github.com/jurwind)
- [Twitter](https://twitter.com/jurwind)
- [LinkedIn](https://linkedin.com/in/jurwind)

---

*Thank you for checking out **News**! Don't forget to ⭐️ the repository if you find it useful!*

---

*Powered by Kotlin and a touch of creativity.*