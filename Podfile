# Uncomment the next line to define a global platform for your project
platform :ios, '11.0'

target 'DialogGRPC' do

  pod 'Dialog-gRPC-Objc', :git => 'https://github.com/dialogs/api-schema.git', :branch => 'feature/objc_support', :inhibit_warnings => true

end

post_install do |installer|
    installer.pods_project.targets.each do |target|
        target.build_configurations.each do |config|
            config.build_settings['BUILD_LIBRARY_FOR_DISTRIBUTION'] = "YES"
        end
    end
end
