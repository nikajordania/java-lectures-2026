## Running the Project in IntelliJ IDEA

### Option 1: Run from the IDE (Recommended for Development)

1. **Open the project in IntelliJ IDEA**
   - If not already open, go to `File → Open` and select the `java-lecture-2026` folder or clone repository using option `Project from Version Control`

2. **Configure the Project SDK**
   - Go to `File → Project Structure` (or press `Ctrl+Alt+Shift+S`)
   - Under `Project Settings → Project`, ensure a JDK is selected
   - If no JDK is configured, click `Add SDK → Download JDK` or point to an existing JDK installation

3. **Run a Java file**
   - Open any Java file with a `main` method (`Program.java`, `HelloWorld.java`)
   - Right-click anywhere in the editor
   - Select `Run 'ClassName.main()'`
   - Alternatively, click the green play button (▶️) in the gutter next to the `main` method
   - Or use the keyboard shortcut `Shift+F10`

4. **View output**
   - The program output will appear in the `Run` panel at the bottom of the IDE

### Option 2: Run from Terminal within IntelliJ IDEA

1. Open the built-in terminal: `View → Tool Windows → Terminal` (or press `Alt+F12`)
2. Follow the command-line compilation and execution steps below

---

## Running from Command Line

### 1. **Compile the Java files**

   ```shell
   javac -d out -cp src/ src/*.java
   ```

- `javac` → Java compiler.
- `-d out` → Specifies the output directory for compiled class files.
- `-cp src` → Sets the classpath to `src` (if there are dependencies within the source folder).
- `src/*.java` → Compiles all Java files in the `src` directory.

### 2. **Run the compiled Java program**

   ```shell
   java -cp out Program
   ```

- `java` → Java runtime.
- `-cp out` → Specifies the classpath to the compiled files.
- `Program` → The main class containing `public static void main(String[] args)`.

### 3. **Create a JAR file**

Manifest file correctness
Create `MANIFEST.MF` in project root directory with the following content:

   ```
   Manifest-Version: 1.0
   Main-Class: Program
   ```

(Make sure that a `Program` Class exists in src and it contains `public static void main(String[] args)`)

   ```shell
   jar cvfm myapp.jar MANIFEST.MF -C out .
   ```

- `jar` → JAR utility to package the application.
- `c` → Create a new JAR file.
- `v` → Verbose mode (lists files being added).
- `f` → Specifies the output filename (`myapp.jar`).
- `m` → Specifies the manifest file (`MANIFEST.MF`).
- `-C out .` → Changes to the `out` directory and adds all files inside.

### 4. **Run the JAR file**

   ```shell
   java -jar myapp.jar
   ```

- Runs the application using the JAR file.