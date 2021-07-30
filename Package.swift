// swift-tools-version:5.3
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription

let package = Package(
    name: "QuranSDK",
    platforms: [
        .iOS(.v9), .macOS(.v10_10), .tvOS(.v9), .watchOS(.v2)
    ],
    products: [
        // Products define the executables and libraries a package produces, and make them visible to other packages.
        .library(
            name: "QuranSDK",
            targets: ["QuranSDK"]
        ),
    ],
    dependencies: [
        // Dependencies declare other packages that this package depends on.
    ],
    targets: [
        // Targets are the basic building blocks of a package. A target can define a module or a test suite.
        // Targets can depend on other targets in this package, and on products in packages this package depends on.
        .target(
            name: "QuranSDK",
            dependencies: [],
            path: "iOS/QuranSDK",
            exclude: ["Supporting Files"],
            resources: [.process("Resources/com.tazkiyatech.quran.v2.db")]
        ),
        .testTarget(
            name: "QuranSDKTests",
            dependencies: ["QuranSDK"],
            path: "iOS/QuranSDKTests",
            exclude: ["Supporting Files"]
        ),
    ]
)
