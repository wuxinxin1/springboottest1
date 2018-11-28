package service;

/**
 * Created by wuxinxin on 2018/11/26.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
