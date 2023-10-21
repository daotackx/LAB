package Repository;

import DataAccess.AnalyzeDao;

public class AnalyzeRepository implements IAnalyzeRepository {

    @Override
    public void getNumber(String inputString) {
        AnalyzeDao.Instance().getNumber(inputString);
    }

    @Override
    public void getCharactrer(String inputString) {
        AnalyzeDao.Instance().getCharacter(inputString);
    }
    
}
