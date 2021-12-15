## to search
- FaaS vs PaaS
- dead letter queue
- mocking, testing
- open source FaaS (google, Serverless: https://github.com/serverless/serverless)
- 12 factor app https://12factor.net/

## Providers

### IBM
- https://www.ibm.com/cloud/learn/faas
- FaaS is subset of Serverless
- Serverless includes compute, storage, database, messaging, api gateway
- FaaS is only event driven compute
- best practices
    - single responsibility functions
    - isolate function => don't directly call others, so use events which are asynchronous
- comparison to PaaS, containers, VM
    - faster provisioning time, in area of milliseconds
    - no/nearly none administration overhead
    - state and persistent connections have to be kept somewhere else
    - no os/runtime maintenance (PaaS too) compared to IaaS
    - no idle resource, functions stop after running
    - only platform with resource limits

### Amazon
- https://aws.amazon.com/lambda/
- use case
    - process data at scale
    - 

### Google
- https://cloud.google.com/functions/
- Integrated security and access management
- Faster development cycle by writing and running small code snippets
- avoid lock-in with open source FaaS 
 
## Alternatives

### BaaS
- superset of FaaS
- database
- user management with option of social login
- integrated analytics

### SaaS
- https://www.heise.de/developer/artikel/Servicemodelle-in-der-Cloud-5033939.html
- complete vendor lock in 
- little customization possible
- Datenschutz

### cross cutting concerns
- Database DBaaS
- Message Queue MQaaS

## How does it work AWS
- Firecracker VM
- MicroVM
- https://firecracker-microvm.github.io/

## OpenFaaS
- https://github.com/openfaas/faas
- https://www.openfaas.com/blog/template-store/
    - 4 parts:
        - Dockerfile: base image with runtime if needed
        - Entrypoint: How the function gets called. Either binary over STDIO oder HTTP Process
        - Handler: User defined component
        - Package List: Dependencies
    - Dockerfile
        - fprocess Variable setzen mit Befehl zum programm starten
- https://blog.alexellis.io/announcing-function-store/