# Uncomment the next line to define a global platform for your project
platform :ios, '11.0'

target 'DialogGRPC' do

  pod 'gRPC-ProtoRPC'
  pod 'Protobuf'

end

post_install do |installer|
    installer.pods_project.targets.each do |target|
        target.build_configurations.each do |config|
            config.build_settings['BUILD_LIBRARY_FOR_DISTRIBUTION'] = "YES"
        end
    end
end
