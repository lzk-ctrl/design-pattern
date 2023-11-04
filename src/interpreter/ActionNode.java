package interpreter;

public class ActionNode extends AbstractNode{
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        String[] wordList = action.trim().split("\\s");
        int wordCount = wordList.length;
        if (wordCount == 2) {
            return action + " *";
        }
        return action;
    }
}