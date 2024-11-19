package presenter;

import view.ConsoleTreeView;
import view.PresenterView;

public class CommandHandler {
    private TreePresenter presenter;
    private PresenterView view;

    public CommandHandler(TreePresenter presenter, ConsoleTreeView view) {
        this.presenter = presenter;
        this.view = (PresenterView) view;
    }

    public void handleUserInput() {
        while (true) {
            view.displayMessage("Enter command (add, list, sortByName, sortByBirthYear, save, load, exit):");
            String command = view.getUserInput();
            presenter.handleCommand(command);
        }
    }
}

