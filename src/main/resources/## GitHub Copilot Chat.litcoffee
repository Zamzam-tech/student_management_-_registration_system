## GitHub Copilot Chat

- Extension: 0.38.2 (prod)
- VS Code: 1.110.1 (61b3d0ab13be7dda2389f1d3e60a119c7f660cc3)
- OS: win32 10.0.26100 x64
- GitHub Account: Zamzam-tech

## Network

User Settings:
```json
  "http.systemCertificatesNode": true,
  "github.copilot.advanced.debug.useElectronFetcher": true,
  "github.copilot.advanced.debug.useNodeFetcher": false,
  "github.copilot.advanced.debug.useNodeFetchFetcher": true
```

Connecting to https://api.github.com:
- DNS ipv4 Lookup: 20.87.245.6 (955 ms)
- DNS ipv6 Lookup: Error (207 ms): getaddrinfo ENOTFOUND api.github.com
- Proxy URL: None (20 ms)
- Electron fetch (configured): HTTP 200 (2701 ms)
- Node.js https: HTTP 200 (1359 ms)
- Node.js fetch: HTTP 200 (974 ms)

Connecting to https://api.individual.githubcopilot.com/_ping:
- DNS ipv4 Lookup: 140.82.113.22 (45 ms)
- DNS ipv6 Lookup: Error (224 ms): getaddrinfo ENOTFOUND api.individual.githubcopilot.com
- Proxy URL: None (11 ms)
- Electron fetch (configured): HTTP 200 (3372 ms)
- Node.js https: timed out after 10 seconds
- Node.js fetch: timed out after 10 seconds

Connecting to https://proxy.individual.githubcopilot.com/_ping:
- DNS ipv4 Lookup: 4.225.11.192 (5135 ms)
- DNS ipv6 Lookup: Error (1809 ms): getaddrinfo ENOTFOUND proxy.individual.githubcopilot.com
- Proxy URL: None (2 ms)
- Electron fetch (configured): HTTP 200 (3584 ms)
- Node.js https: HTTP 200 (7172 ms)
- Node.js fetch: timed out after 10 seconds

Connecting to https://mobile.events.data.microsoft.com: timed out after 10 seconds
Connecting to https://dc.services.visualstudio.com: timed out after 10 seconds
Connecting to https://copilot-telemetry.githubusercontent.com/_ping: timed out after 10 seconds
Connecting to https://telemetry.individual.githubcopilot.com/_ping: timed out after 10 seconds
Connecting to https://default.exp-tas.com: timed out after 10 seconds

Number of system certificates: 105

## Documentation

In corporate networks: [Troubleshooting firewall settings for GitHub Copilot](https://docs.github.com/en/copilot/troubleshooting-github-copilot/troubleshooting-firewall-settings-for-github-copilot).