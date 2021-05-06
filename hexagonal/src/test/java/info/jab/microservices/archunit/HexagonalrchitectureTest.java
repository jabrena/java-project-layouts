package info.jab.microservices.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "info.jab.microservices")
public class HexagonalrchitectureTest {

    @ArchTest
    static ArchRule onionArchitecture =  onionArchitecture()
        //.domainModels("com.myapp.domain.model..")
        .domainServices("com.myapp.domain.service..")
        .applicationServices("com.myapp.application..")
        .adapter("persistence", "com.myapp.adapter.persistence..")
        .adapter("rest", "com.myapp.adapter.rest..");    
}
