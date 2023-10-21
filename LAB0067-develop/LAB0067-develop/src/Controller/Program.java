package Controller;

import Common.Validation;
import Model.Input;
import Repository.AnalyzeRepository;
import Repository.IAnalyzeRepository;
import View.Menu;

public class Program extends Menu<String> {
    private IAnalyzeRepository analyzeRepository;
    static String[] menuChoice = {"Input String","Get number","Get character"};
    Input i;

    public Program(){
        super("========== Analysis String program ==========", menuChoice);
        analyzeRepository = new AnalyzeRepository();
        i = new Input();
    }

    public void execute(int n){
        switch(n){
            case 1:{
                i.setValue(Validation.getString("Input String: "));
                break;
            }
            case 2:{
                analyzeRepository.getNumber(i.getValue());
                break;
            }
            case 3:{
                analyzeRepository.getCharactrer(i.getValue());
            }
        }
    }
}
