{ pkgs }: {
    deps = [
        pkgs.haskellPackages.concurrent-dns-cache
        pkgs.abc-verifier
        pkgs.javacc
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}