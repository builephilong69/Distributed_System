## Cloud Based Service
- Cloud computing widely adopted : On - demand provisioning and elasticity ( co giãn theo cầu giá)
                                  - abilty to scale up at short notice and to release unused resources for use by others
- Infrastructure as a service: Virtual vs Real machine
- Software as a service : Enterpirse application, emails shared doc, etc...
- Potential drawbacks : Security + Network bandith



## I/O parallelism
- Reduce the time required to retrieve realtions from disk by partiontioning the frelations on multiple disks. on multiple nodes(computer)
- Horizontal partitioning : - tuples of a relation are dicided among many nodes such that some subset ò tuple resides on each node. ( chia ngang cái bảng ra theo tuples)
- Partitioning techniques( number of nodes = n):
    - Round robin: Send the I(th) tuple inserted in the realtion to node i mod n
    - Hash partitioning: 
    + Choose one or more attributes ass the partitioning attributes
    + Choose hash Function h with range 0..n-1
    + Let i denote result of hash function h applied to the partitioning attribute value of a tuple. Sned tuple to node i.
