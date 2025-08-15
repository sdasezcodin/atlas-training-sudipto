// Command Interface
interface Command {
    void execute();
}

// Receiver
class TextEditor {
    public void copy() { System.out.println("Text copied."); }
    public void paste() { System.out.println("Text pasted."); }
}

// Concrete Commands
class CopyCommand implements Command {
    private TextEditor editor;
    public CopyCommand(TextEditor editor) { this.editor = editor; }
    public void execute() { editor.copy(); }
}
class PasteCommand implements Command {
    private TextEditor editor;
    public PasteCommand(TextEditor editor) { this.editor = editor; }
    public void execute() { editor.paste(); }
}

// Invoker
class Button {
    private Command command;
    public Button(Command command) { this.command = command; }
    public void click() { command.execute(); }
}

// Demo
public class CommandPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Button copyBtn = new Button(new CopyCommand(editor));
        Button pasteBtn = new Button(new PasteCommand(editor));

        copyBtn.click();
        pasteBtn.click();
    }
}

