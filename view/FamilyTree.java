package view;

import presenter.TreePresenter;

public interface FamilyTree extends MessageView, PersonView, InputView
{
    void setPresenter(TreePresenter presenter);
}