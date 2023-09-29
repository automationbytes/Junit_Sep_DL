package Junit4Examples;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class TestRuleTemFolder {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void createFile() throws IOException {
        File file = temporaryFolder.newFile("abc.txt");
    }
}
