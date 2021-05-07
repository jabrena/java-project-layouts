package info.jab.microservices.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "info.jab.microservices")
public class HexagonalrchitectureTest {

    @ArchTest
    static ArchRule onionArchitecture =  onionArchitecture()
        .domainModels("info.jab.microservices.domain.model..")
        .domainServices("info.jab.microservices.domain.service..")
        .applicationServices("info.jab.microservices.application..")
        .adapter("persistence", "info.jab.microservices.adapter.persistence..")
        .adapter("rest", "info.jab.microservices.adapter.rest..");
}
