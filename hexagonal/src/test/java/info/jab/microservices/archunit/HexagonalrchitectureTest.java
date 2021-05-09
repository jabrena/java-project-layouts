package info.jab.microservices.archunit;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;
import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "info.jab.microservices")
public class HexagonalrchitectureTest {

    @ArchTest
    static final ArchRule hexagonal_dependencies_are_respected = layeredArchitecture()

            .layer("Application").definedBy("..application..")
            .layer("Domain").definedBy("..domain..")
            .layer("Infrastructure").definedBy("..infrastructure..");

            //.whereLayer("Application").mayOnlyBeAccessedByLayers("Domain");
            //.whereLayer("Domain").mayOnlyBeAccessedByLayers("Application")
            //.whereLayer("Infrastructure").mayOnlyBeAccessedByLayers("Domain");
}
