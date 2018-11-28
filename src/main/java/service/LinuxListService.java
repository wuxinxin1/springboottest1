package service;

/**
 * Created by wuxinxin on 2018/11/26.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
