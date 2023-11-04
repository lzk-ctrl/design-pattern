package observer;

import java.util.ArrayList;

public class EditSubject extends Subject{
    private String editContent;
    public String getEditContent() {
        return editContent;
    }
    public void edit(String editContent) {
        this.editContent = editContent;
        notifyObserver();
    }
    public EditSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
